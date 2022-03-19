public class melon {
    public String checkWeight(int size){
        if (size == 2){
            return "NO";
        }
        else if(size % 2 == 0){
            return "YES";
        }
        else {
            return "NO";
        }
    }

}
