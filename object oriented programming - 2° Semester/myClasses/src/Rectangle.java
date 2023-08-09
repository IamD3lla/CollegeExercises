public class Rectangle {

    //Class attributes // Atributos da Classe = ESTADO da class
    float height, width;

    public Rectangle(float height, float width) {

        this.height = height; //"this" calls the variable in the instance with the same name
        this.width = width;

    }

    //Class methods// Métodos da classe = COMPORTAMENTO da classe
    float perimeterCalculate() {
        float pc;   //Local variable//Variável Local
        pc = 2 * height + 2 * width;
        return pc;
    }

    void printData() {
      float p;  //Local variable//Variável Local
      p = perimeterCalculate(); // calculates the perimeter// Calcula o perímetro do retangulo
        System.out.println("Rectangle: ");
        System.out.println("- height: " + height);
        System.out.println("- width: " + width);
        System.out.println("- perimeter: " + p);
    }

    //Main method - start the program//Método principal - inicio da exeução do programa
    public static void main(String[] args) {
        System.out.println("Rectangle World!");

        //Object rectangle rect1
        Rectangle rect1; //references the object of the class rectangle//referencia o objeto da classe retangulo
        rect1 = new Rectangle(10, 20); //Instance of rectangle class in an object
        rect1.printData(); // calls the method of the object

        //Object rectangle rect2
        Rectangle rect2 = new Rectangle(5, 15);
        rect2.printData(); // calls the method of the object

    }




}
