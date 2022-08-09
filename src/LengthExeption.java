public class LengthExeption extends Exception{      //создаем свое исключение,наследуется от класса Exception
    public LengthExeption (String discription){     // определяем конструктор, который принимает в себя аргумент (строка)
        super(discription);
    }
}
