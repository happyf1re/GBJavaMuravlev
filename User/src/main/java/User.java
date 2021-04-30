public class User {
    String name;
    String position;
    String email;
    String phone;
    int income;
    int age;

    public User (String name, String position, String email, String phone, int income, int age) {
       this.name = name;
       this.position = position;
       this.email = email;
       this.phone = phone;
       this.income = income;
       this.age = age;
    }
    void checkout() {
        System.out.println(name + " " + position + " " + email + " " + phone + " " + income + " " + age);
    }

    public static void main(String[] args) {
        User[] usArray = new User[5];
        usArray[0] = new User("Муравлёв Дмитрий Алексеевич", "Инженер", "dmur1991@gmail.com", "89032150022", 150000, 29);
        usArray[1] = new User("Иванов Иван Иванович", "Аналитик", "ivan@gmail.com", "823232322", 120000, 42);
        usArray[2] = new User("Иванова Наталья Ивановна", "Водитель", "nat@gmail.com", "99999999", 110000, 48);
        usArray[3] = new User("Петров Пётр Петрович", "Грузчик", "pet@gmail.com", "966666666", 50000, 18);
        usArray[4] = new User("Петров Василий Петрович", "Грузчик", "pet1@gmail.com", "9666555555", 50000, 38);

        for (int i = 0; i < usArray.length; i++) {
            if (usArray[i].age > 40){
                System.out.println(usArray[i].name + " " + usArray[i].position + " " + usArray[i].email + " " + usArray[i].phone
                        + " " + usArray[i].income + " " + usArray[i].age);
            }
        }

        }
    }

