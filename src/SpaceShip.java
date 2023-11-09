public interface SpaceShip {
    boolean launch(); //czy lądowanie sukcesywne czy nie
    boolean land();
    boolean canCarry(Item item); //czy rakieta może unieść pakunek
    int carry(Item item); //waga pakunku

}
