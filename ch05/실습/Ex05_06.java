package oosProject.ch05.실습;

class Weapon {
    protected int fire() {
        return 1;
    }
}

class Cannon extends Weapon {
    @Override
    protected int fire() {
        return 10;
    }
}

public class Ex05_06 {
    public static void main(String[] args) {
        Weapon weapon;
        weapon = new Weapon();
        System.out.println("기본 무기의 살상 능력은 " + weapon.fire());
        weapon = new Cannon();
        System.out.println("대포의 살상 능력은 " + weapon.fire());
    }
}