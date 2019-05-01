void setup() {
  size(800,800);
}

void draw() {
  fill(#AA8E00);
  ellipse(400,400,300,300);
  fill(#C1190A);
  ellipse(400,400,250,250);
  fill(#FAD412);
  ellipse(400,400,235,235);
  PImage strawberry = loadImage("strawberry.jpeg");
  image(strawberry, 345,345);
}