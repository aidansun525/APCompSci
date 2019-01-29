public static String[][] makeList(String ballot){
        String[][] list = new String[250][5];
        String[] firstParse = ballot.split(";");

        for (int i = 0; i < 250; i++){
            String[] x = firstParse[i].split(",");
            for (int j = 0; j < 5 ; j++){
                list[i][j] = x[j];
            }
        }

        for (int i = 0; i<250; i++){
            for (int j=0; j<5; j++){
                System.out.println(list[i][j]);
            }
        }
        return list;
    }
