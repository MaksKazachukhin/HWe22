public class Main {
    public static void main(String[] args) {
        Print[] objects = new Print[3];

        objects[0] = createObject("2й");
        objects[1] = createObject("3й");
        objects[2] = createObject("4й");

        // Вызов метода print() для каждого объекта
        for (Print obj : objects) {
            obj.print();
        }
    }

    public static Print createObject(String className) {
        switch (className) {
            case "2й":
                return new two("Object 2", 18);
            case "3й":
                return new three("Object 3", "Bishkek");
            case "4й":
                return new Four("Object 4", "mkaaazacuhin@mail.ru");
            default:
                return null;
        }
    }
}
