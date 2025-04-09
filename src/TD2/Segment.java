package TD2;

public class Segment {
    public int point1 = 0;
    public int point2 = 0;

    public Segment() {

    }
    public Segment(int point1, int point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public int calculSegment(){
        return this.point1 += this.point2;
    }
    public boolean isInSegment(int x){
        if ( x >= this.point1  && x <= this.point2 ){
            return true;
        }
        return false;
    }


}
