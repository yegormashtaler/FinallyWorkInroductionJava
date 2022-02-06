package H13;

import java.util.Objects;
import java.util.Scanner;

public class ElfSwordsman extends MainClass {
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
        super.jump();
    }

    @Override
    public void fire() {
        super.fire();
    }

    @Override
    public void kill() {
    }

    public static int getUserData(Scanner scanner) {
        try {
            return Integer.parseInt(scanner.next());
        } catch (Exception e) {
            return -1;
        }
    }

    public void outputGreetingsForElfSwordsman() {
        Scanner scanner = new Scanner(System.in);
        ElfSwordsman elfSwordsmanOne = new ElfSwordsman() {
            @Override
            public void fire() {
            }
        };
        elfSwordsmanOne.setName("Arkodyr Teasmeade");
        elfSwordsmanOne.setAge(764);
        elfSwordsmanOne.setGrowth(107);
        elfSwordsmanOne.setGender("male");
        elfSwordsmanOne.setPower("magic sword, magic shield");
        ElfSwordsman elfSwordsmanTwo = new ElfSwordsman() {
            @Override
            public void fire() {
            }
        };
        elfSwordsmanTwo.setName("Brasenia Jackaper");
        elfSwordsmanTwo.setAge(436);
        elfSwordsmanTwo.setGrowth(56);
        elfSwordsmanTwo.setGender("female");
        elfSwordsmanTwo.setPower("magic blade, magic armor");
        ElfSwordsman elfSwordsmanThree = new ElfSwordsman() {
            @Override
            public void fire() {
            }
        };
        elfSwordsmanThree.setName("Junipera Quirsk");
        elfSwordsmanThree.setAge(356);
        elfSwordsmanThree.setGrowth(32);
        elfSwordsmanThree.setGender("female");
        elfSwordsmanThree.setPower("enchanted potion, smashing blade");
        ElfSwordsman elfSwordsmanFour = new ElfSwordsman() {
            @Override
            public void fire() {
            }
        };
        elfSwordsmanFour.setName("Chaloma Culverburn");
        elfSwordsmanFour.setAge(453);
        elfSwordsmanFour.setGrowth(86);
        elfSwordsmanFour.setGender("male");
        elfSwordsmanFour.setPower("magic sword, magic spells");
        ElfSwordsman[] elfSwordsmenArray = {elfSwordsmanOne, elfSwordsmanTwo, elfSwordsmanThree, elfSwordsmanFour};
        int userChoice = getUserData(scanner);
        switch (userChoice) {
            case 0 -> {
                System.out.println();
                System.out.println("> " + "Sorry, your choice was output from system...");
                System.out.println();
                System.out.println("> " + "The program terminates!");
                System.exit(0);
            }
            case 3 -> {
                for (ElfSwordsman elfSwordsman : elfSwordsmenArray) {
                    if ((Objects.equals(elfSwordsman.getName(), "Arkodyr Teasmeade")) || (elfSwordsman.getAge() == 764) || (elfSwordsman.getGrowth() == 107) || (Objects.equals(elfSwordsman.getGender(), "male")) || (Objects.equals(elfSwordsman.getPower(), "magic sword, magic shield"))) {
                        System.out.println();
                        System.out.println("> " + "Hey! I'm an Elf Swordsman! My name is " + elfSwordsman.getName() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My age is " + elfSwordsman.getAge() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My growth is " + elfSwordsman.getGrowth() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My gender is " + elfSwordsman.getGender() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My power is " + elfSwordsman.getPower());
                        System.out.println();
                    }
                }
                for (ElfSwordsman elfSwordsman : elfSwordsmenArray) {
                    if ((Objects.equals(elfSwordsman.getName(), "Brasenia Jackaper")) || (elfSwordsman.getAge() == 436) || (elfSwordsman.getGrowth() == 56) || (Objects.equals(elfSwordsman.getGender(), "female")) || (Objects.equals(elfSwordsman.getPower(), "magic blade, magic armor"))) {
                        System.out.println();
                        System.out.println("> " + "Hey! I'm an Elf Swordsman! My name is " + elfSwordsman.getName() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My age is " + elfSwordsman.getAge() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My growth is " + elfSwordsman.getGrowth() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My gender is " + elfSwordsman.getGender() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My power is " + elfSwordsman.getPower());
                        System.out.println();
                    }
                }
                for (ElfSwordsman elfSwordsman : elfSwordsmenArray) {
                    if ((Objects.equals(elfSwordsman.getName(), "Junipera Quirsk")) || (elfSwordsman.getAge() == 356) || (elfSwordsman.getGrowth() == 32) || (Objects.equals(elfSwordsman.getGender(), "female")) || (Objects.equals(elfSwordsman.getPower(), "enchanted potion, smashing blade"))) {
                        System.out.println();
                        System.out.println("> " + "Hey! I'm an Elf Swordsman! My name is " + elfSwordsman.getName() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My age is " + elfSwordsman.getAge() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My growth is " + elfSwordsman.getGrowth() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My gender is " + elfSwordsman.getGender() + "\n\n" +
                                "> " + "Hey! I'm an Elf Swordsman! My power is " + elfSwordsman.getPower());
                    }
                    break;
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