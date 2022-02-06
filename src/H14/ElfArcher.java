package H13;

import java.util.Objects;
import java.util.Scanner;

public class ElfArcher extends MainClass {
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
        super.run();
    }

    @Override
    public void jump() {
    }

    @Override
    public void fire() {
    }

    @Override
    public void kill() {
        super.kill();
    }

    public static int getUserData(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }

    public void outputGreetingsForElfArcher() {
        Scanner scanner = new Scanner(System.in);
        ElfArcher elfArcherOne = new ElfArcher() {
            @Override
            public void kill() {
            }
        };
        elfArcherOne.setName("Spector Cordalis");
        elfArcherOne.setAge(351);
        elfArcherOne.setGrowth(117);
        elfArcherOne.setGender("male");
        elfArcherOne.setPower("magic bow, magic arrows");
        ElfArcher elfArcherTwo = new ElfArcher() {
            @Override
            public void fire() {
            }
        };
        elfArcherTwo.setName("Tuago Tingstall");
        elfArcherTwo.setAge(586);
        elfArcherTwo.setGrowth(101);
        elfArcherTwo.setGender("male");
        elfArcherTwo.setPower("elf totem, recurve crossbow");
        ElfArcher elfArcherThree = new ElfArcher() {
            @Override
            public void fire() {
            }
        };
        elfArcherThree.setName("Marabellan Stemlock");
        elfArcherThree.setAge(276);
        elfArcherThree.setGrowth(100);
        elfArcherThree.setGender("female");
        elfArcherThree.setPower("invisible robe, elf shuriken");
        ElfArcher elfArcherFour = new ElfArcher() {
            @Override
            public void fire() {
            }
        };
        elfArcherFour.setName("Pyrus Tollbrook");
        elfArcherFour.setAge(602);
        elfArcherFour.setGrowth(77);
        elfArcherFour.setGender("male");
        elfArcherFour.setPower("angel wings, elf boomerang");
        ElfArcher[] elfArchersArray = {elfArcherOne, elfArcherTwo, elfArcherThree, elfArcherFour};
        int userChoice = getUserData(scanner);
        switch (userChoice) {
            case 0 -> {
                System.out.println();
                System.out.println("> " + "Sorry, your choice was output from system...");
                System.out.println();
                System.out.println("> " + "The program terminates!");
                System.exit(0);
            }
            case 1 -> {
                for (ElfArcher elfArcher : elfArchersArray) {
                    if ((Objects.equals(elfArcher.getName(), "Spector Cordalis")) || (elfArcher.getAge() == 351) || (elfArcher.getGrowth() == 117) || (Objects.equals(elfArcher.getGender(), "male")) || (Objects.equals(elfArcher.getPower(), "magic bow, magic arrows"))) {
                        System.out.println();
                        System.out.println("> " + "Hey! I'm Elf Archer! My name is " + elfArcher.getName() + "\n\n" +
                                "> " + "Hey! I'm Elf Archer! My age is " + elfArcher.getAge() + "\n\n" +
                                "> " + "Hey! I'm Elf Archer! My growth is " + elfArcher.getGrowth() + "\n\n" +
                                "> " + "Hey! I'm Elf Archer! My gender is " + elfArcher.getGender() + "\n\n" +
                                "> " + "Hey! I'm Elf Archer! My power is " + elfArcher.getPower());
                        System.out.println();
                    }
                }
                for (ElfArcher elfArcher : elfArchersArray) {
                    if ((Objects.equals(elfArcher.getName(), "Marabellan Stemlock")) || (elfArcher.getAge() == 276) || (elfArcher.getGrowth() == 100) || (Objects.equals(elfArcher.getGender(), "female")) || (Objects.equals(elfArcher.getPower(), "invisible robe, elf shuriken"))) {
                        System.out.println();
                        System.out.println("> " + "Hey! I'm Elf Archer! My name is " + elfArcher.getName() + "\n\n" +
                                "> " + "Hey! I'm Elf Archer! My age is " + elfArcher.getAge() + "\n\n" +
                                "> " + "Hey! I'm Elf Archer! My growth is " + elfArcher.getGrowth() + "\n\n" +
                                "> " + "Hey! I'm Elf Archer! My gender is " + elfArcher.getGender() + "\n\n" +
                                "> " + "Hey! I'm Elf Archer! My power is " + elfArcher.getPower());
                    }
                }
            }
            default -> {
                System.out.println();
                System.out.println("> " + "Sorry, but you entered incorrect data, the program stops working...");
                System.out.println();
                System.out.println("> " + "The program terminates!");
                System.exit(0);
            }
        }
        scanner.close();
    }
}