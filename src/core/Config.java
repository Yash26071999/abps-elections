package core;

public class Config {
    
    final public String candidateBoy1 = "Robert Ford";
    final public String candidateBoy2 = "William Smith";
    final public String candidateBoy3 = "Bernard Lowe";
    final public String candidateBoy4 = "Teddy Flood";
       
    final public String candidateGirl1 = "Dolores Abernathy";
    final public String candidateGirl2 = "Maeve Millay";
    final public String candidateGirl3 = "Emily Smith";
    
    // 150 x 150 pixels LOGO in JPG
    
    final public String candidateBoy1logo = "src/assets/westworld_logo.jpg";
    final public String candidateBoy2logo = "src/assets/westworld_logo.jpg";
    final public String candidateBoy3logo = "src/assets/westworld_logo.jpg";
    final public String candidateBoy4logo = "src/assets/westworld_logo.jpg";
    
    final public String candidateGirl1logo = "src/assets/westworld_logo.jpg";
    final public String candidateGirl2logo = "src/assets/westworld_logo.jpg";
    final public String candidateGirl3logo = "src/assets/westworld_logo.jpg";
    
    final public String passcode = "6174";
    
    final public int[] Class6thA = {1001, 1036};    
    final public int[] Class6thB = {1051, 1086};
    final public int[] Class6thC = {1101, 1136};
    
    final public int[] Class7thA = {1151, 1188};
    final public int[] Class7thB = {1201, 1238};
    final public int[] Class7thC = {1251, 1288};
    
    final public int[] Class8thA = {1301, 1338};
    final public int[] Class8thB = {1351, 1387};
    final public int[] Class8thC = {1401, 1437};
    
    final public int[] Class9thA = {1451, 1482};
    final public int[] Class9thB = {1501, 1535};
    final public int[] Class9thC = {1551, 1585};
    
    final public int[] Class10thA = {1601, 1626};
    final public int[] Class10thB = {1651, 1686};
    final public int[] Class10thC = {1701, 1736};
    
    final public int[] Class11thA = {1751, 1786};
    final public int[] Class11thB = {1801, 1833};
    
    final public int[] Class12thA = {1851, 1876};
    final public int[] Class12thB = {1901, 1921};

    final public int[][] arrays = new int[][]{
                                                Class6thA, Class6thB, Class6thC, 
                                                Class7thA, Class7thB, Class7thC, 
                                                Class8thA, Class8thB, Class8thC,
                                                Class9thA, Class9thB,Class9thC,
                                                Class10thA, Class10thB, Class10thC,
                                                Class11thA, Class11thB,
                                                Class12thA, Class12thB
                                            };
    final public String[] classes = {
                                    "6th A", "6th B", "6th C", 
                                    "7th A", "7th B", "7th C", 
                                    "8th A", "8th B", "8th C", 
                                    "9th A", "9th B", "9th C", 
                                    "10th A", "10th B", "10th C", 
                                    "11th A", "11th B", 
                                    "12th A", "12th B"
                                };
    
    public String giveClass(int rollno){
        String classname = null;
        for (int i = 0, count = arrays.length; i < count; i++){
            if (arrays[i][0] <= rollno && rollno <= arrays[i][1] ){
                classname = classes[i];
            }
        }
        return classname;
    }


}
