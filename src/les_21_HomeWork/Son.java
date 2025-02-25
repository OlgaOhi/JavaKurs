package les_21_HomeWork;

public class Son {

     String name;
     int age;
     String hobby;
     String learned_language;
     boolean tutor;
     String school_performance;

    public Son(String name, int age) {
        this.name = name;
        this.age = age;
        this.hobby = "drawing";
        this.learned_language = "german";
        this.tutor = true;
        this.school_performance = "good";
    }


    public static void main(String[] args) {

        Son mySon = new Son("Ivan", 10);

        if (mySon.has_tutor()) {
            System.out.println("Ivan is learning a language with a tutor");
        } else {
            System.out.println("Ivan learns the language on his own");
        }
    }

    public void has_hobby () {
        System.out.println(name + "is" + age + "years old and his hobby is" + hobby);
        }
        public void learn_language () {
            System.out.println(name + "is learning" + learned_language);
        }
        public void go_to_school () {
            System.out.println(name + "goes to school and has" + school_performance + "grades");
        }
        public boolean has_tutor () {
            return tutor;
        }

    }



