package agh.ics.oop;

public enum MapDirection {
    NORTH,
    SOUTH,
    WEST,
    EAST;

    public String toString(){
        switch(this){
            case NORTH -> return "Północ";
            case SOUTH -> return "Południe";
            case WEST -> return "Zachód";
            case EAST -> return "Wschód";
        }
    }

    public MapDirection next(){
        return this

        }
    }

}
