enum Direction{
    N,S,E,W;
    Direction (){
        System.out.println(this.ordinal());
    }
}

class Enum{
    public static void main(String[] args) {

        Direction d1[] =Direction.values();
        for (Direction D:d1)
        System.out.println(Direction.valueOf(D.toString()));
    }

}
