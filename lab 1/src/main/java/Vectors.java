public class Vectors {

    public static String Vector(int forceArray[][]) {
        int forces[]={0,0,0,};
        for(int i=0;i<forceArray.length;i++){
            forces[0] += forceArray[i][0];
            forces[1] += forceArray[i][1];
            forces[2] += forceArray[i][2];

        }
        if (forces[0] == 0 && forces[1] == 0 && forces[2] == 0) {
            return "YES";
        } else return "NO";
    }
}
