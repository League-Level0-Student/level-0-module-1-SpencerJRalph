void setup(){
  PImage face = loadImage("face.jpeg");
  size(2000,1000);
face.resize(2000, 1000);
image(face, 0, 0);
}
void draw(){
  fill(#FF0004);
ellipse(786,448, 200, 200);
ellipse(1063, 405, 200, 200);

}
