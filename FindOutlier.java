public class FindOutlier {
    public static void main(String[] args) {

    }
    static int find(int[] integers){
        byte evenVoters=0, oddVoters=0, target;
        for (int i=0 ; i<3; i++)
            if (Math.abs(integers[i]) % 2 == 0)
                evenVoters++;
            else
                oddVoters++;

        target = (byte) (evenVoters > oddVoters ? 1 : 0);
        for (int i=0; i<integers.length; i++)
            if(Math.abs(integers[i]) % 2 == target)
                return integers[i];
        return -1;
    }

}
