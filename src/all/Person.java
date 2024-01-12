package all;

import interfaces.*;

public class Person extends absCharacter implements intActions {

    public Person(String name) {
        super(name);
    }


    @Override
    public void grewUp() {
        System.out.println(this.getName() + " выросла");
    }

    @Override
    public void gotUp(partsBody type) {
        switch (type) {
            case head:
                System.out.println(this.getName() + " встала на голову");
                break;
            case arms:
                System.out.println(this.getName() + " встала на руки");
                break;
            case legs:
                System.out.println(this.getName() + " встала на ноги");
                break;
            case knees:
                System.out.println(this.getName() + " встала на колени");
                break;
            case elbows:
                System.out.println(this.getName() + " встала на локти");
                break;
        }
    }

    @Override
    public void lay(String object) {
        System.out.println(this.getName() + " легла на " + object);
    }

    @Override
    public void leanedOn(partsBody type,String object) {
        switch (type) {
            case head:
                System.out.println(this.getName() + " уперлась головой в " + object);
                break;
            case arms:
                System.out.println(this.getName() + " уперлась руками в "+ object);
                break;
            case legs:
                System.out.println(this.getName() + " уперлась ногами в "+ object);
                break;
            case knees:
                System.out.println(this.getName() + " уперлась коленями в "+ object);
                break;
            case elbows:
                System.out.println(this.getName() + " уперлась локтями в "+ object);
                break;
        }
    }

    @Override
    public void putIn(partsBody type) {
        switch (type) {
            case head:
                System.out.println(this.getName() + " не может положить голову за голову!!!");
                break;
            case arms:
                System.out.println(this.getName() + " положила руки за голову");
                break;
            case legs:
                System.out.println(this.getName() + " положила ноги за голову");
                break;
            case knees:
                System.out.println(this.getName() + " положила колени за голову");
                break;
            case elbows:
                System.out.println(this.getName() + " положила локти за голову");
                break;
        }
    }

    @Override
    public void StickedOut(partsBody type,String object) {
        switch (type) {
            case head:
                System.out.println(this.getName() + " высунула голову в "+ object);
                break;
            case arms:
                System.out.println(this.getName() + " высунула руки в "+ object);
                break;
            case legs:
                System.out.println(this.getName() + " высунула ноги в "+ object);
                break;
            case knees:
                System.out.println(this.getName() + " высунула колени в "+ object);
                break;
            case elbows:
                System.out.println(this.getName() + " высунула локти в "+ object);
                break;
        }
    }

    @Override
    public void placedIn(partsBody type,String object) {
        switch (type) {
            case head:
                System.out.println(this.getName() + " поместила голову в "+ object);
                break;
            case arms:
                System.out.println(this.getName() + " поместила руки в "+ object);
                break;
            case legs:
                System.out.println(this.getName() + " поместила ноги в "+ object);
                break;
            case knees:
                System.out.println(this.getName() + " поместила колени в "+ object);
                break;
            case elbows:
                System.out.println(this.getName() + " поместила локти в "+ object);
                break;
        }
    }
    @Override
    public int hashCode() {
        return super.hashCode() + this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return "Человек " + this.getName();
    }
}
