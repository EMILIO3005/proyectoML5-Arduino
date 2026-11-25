//Declaraciones globales


//Se ejecuta primero pero una sola vez

void setup(){
  size(64, 64);
}

//Se ejecuta en un loop

void draw(){

  for (int i = 0; i < 3; i++){
    //Configuracion
    background(255);
    pushMatrix();   //Traslacion de objetos
    strokeWeight(4); //Borde
    
    
    float r = random(8, 24); //Radio
    float x = random(r, width - r);  //Eje x
    float y = random(r, height -r);  //Eje Y
  
    //Color de borde
    stroke(random(100), random(100), random(100));
    
    //Mover el plano
    translate(x, y);
    
    //Condicion 0 = circulos
    
    if (i == 0){
      circle(0, 0, (r * 2));
      saveFrame("data/circle###.png");
    }else if(i == 1){
      //Cuadrados
      rectMode(CENTER);
      rotate(random(-0.1, 0.1));
      square(0, 0, (r * 2));
      saveFrame("data/square###.png");
    } else if (i == 2){
      
      //Triangulos
      rotate(random(-0.1, 0.1));
      triangle(0, -r, r, r, -r, r);
      saveFrame("data/triangle###.png");
    }
    
    popMatrix();
  }
  
  if (frameCount == 100){
    exit();
  }
}