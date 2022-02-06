package H13;

import java.util.Objects;
import java.util.Scanner;

public class ElfOrdinary extends MainClass {
    private String name;
    private int age;
    private int growth;
    private String gender;
    private String power;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public void run() {
    }

    @Override
    public void jump() {
    }

    public static int getUserData(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }

    public void outputGreetingsForElfOrdinary() {
        Scanner scanner = new Scanner(System.in);
        ElfOrdinary elfOrdinaryOne = new ElfOrdinary() {
            @Override
            public void run() {
            }

            @Override
            public void jump() {
            }
        };
        elfOrdinaryOne.setName("Guinon Grumbold");
        elfOrdinaryOne.setAge(726);
        elfOrdinaryOne.setGrowth(177);
        elfOrdinaryOne.setGender("male");
        elfOrdinaryOne.setPower("magic sphere, hell star");
        ElfOrdinary elfOrdinaryTwo = new ElfOrdinary() {
            @Override
            public void run() {
            }

            @Override
            public void jump() {
            }
        };
        elfOrdinaryTwo.setName("Amaryllis Backmount");
        elfOrdinaryTwo.setAge(908);
        elfOrdinaryTwo.setGrowth(170);
        elfOrdinaryTwo.setGender("male");
        elfOrdinaryTwo.setPower("golden apple, magma");
        ElfOrdinary elfOrdinaryThree = new ElfOrdinary() {
            @Override
            public void run() {
            }

            @Override
            public void jump() {
            }
        };
        elfOrdinaryThree.setName("Marya Gracehollow");
        elfOrdinaryThree.setAge(471);
        elfOrdinaryThree.setGrowth(171);
        elfOrdinaryThree.setGender("male");
        elfOrdinaryThree.setPower("magic stone, ifrit stick");
        ElfOrdinary elfOrdinaryFour = new ElfOrdinary() {
            @Override
            public void run() {
            }

            @Override
            public void jump() {
            }
        };
        elfOrdinaryFour.setName("Hanson Dreadbeech");
        elfOrdinaryFour.setAge(324);
        elfOrdinaryFour.setGrowth(71);
        elfOrdinaryFour.setGender("male");
        elfOrdinaryFour.setPower("magic field, magic runes");
        ElfOrdinary[] elfOrdinariesArray = {elfOrdinaryOne, elfOrdinaryTwo, elfOrdinaryThree, elfOrdinaryFour};
        int userChoice = getUserData(scanner);
        switch (userChoice) {
            case 0:
                System.out.println();
                System.out.println("> " + "Sorry, your choice was output from system...");
                System.out.println();
                System.out.println("> " + "The program terminates!");
                System.exit(0);
                break;
            case 2:
                for (ElfOrdinary elfOrdinary : elfOrdinariesArray) {
                    if ((Objects.equals(elfOrdinary.getName(), "Guinon Grumbold")) || (elfOrdinary.getAge() == 547) || (elfOrdinary.getGrowth() == 111) || (Objects.equals(elfOrdinary.getGender(), "male")) || (Objects.equals(elfOrdinary.getPower(), "magic sphere"))) {
                        System.out.println();
                        System.out.println("> " + "Hey! I'm ordinary Elf! My name is " + elfOrdinary.getName() + "\n\n" +
                                "> " + "Hey! I'm ordinary Elf! My age is " + elfOrdinary.getAge() + "\n\n" +
                                "> " + "Hey! I'm ordinary Elf! My growth is " + elfOrdinary.getGrowth() + "\n\n" +
                                "> " + "Hey! I'm ordinary Elf! My gender is " + elfOrdinary.getGender() + "\n\n" +
                                "> " + "Hey! I'm ordinary Elf! My power is " + elfOrdinary.getPower());
                        System.out.println();
                    }
                }
                break;
        }
        scanner.close();
    }
}