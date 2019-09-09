package com.example.tugas6_keterampilan;

import java.util.ArrayList;

public class DataSepatu2 {

    public static String[][] data = new String[][]{
            {"Flypower White Control", "https://s3.bukalapak.com/img/8118544435/original/Sepatu_Badminton_Flypower_White_Control_Black_Pink_Purple.jpg"},
            {"Yonex Aerus 3 Blue", "https://www.khelmart.com/Cricket/zoomer_Image/YO_SH_07001_DD_large.jpg"},
            {"VICTOR A960", "https://ecs7.tokopedia.net/img/cache/700/product-1/2019/2/27/5413332/5413332_9d6f1c2a-51b0-4c89-a408-ba076223efc5_1100_1100.jpg"},
            {"RS JF 890", "https://ecs7.tokopedia.net/img/cache/700/product-1/2019/5/3/5256158/5256158_75422f26-b555-489d-92c4-9ac504ef13ef_1080_1080.jpg"},
            {"Li-Ning AYTM 105 Black Orange", "https://shopbadmintononline.com/images/mens_badminton_shoe-AYTM105-1_B.jpg"},
            {"Li-Ning CLOUD II Red", "http://10n10.com.sg/wp-content/uploads/8-2.jpg"},
            {"Hart HS 503 Citroen", "https://ecs7.tokopedia.net/img/product-1/2017/12/17/0/0_2fe00d04-ff63-4c99-b6b3-c25ad41b1c11_2048_0.jpg"},
            {"Mizuno Thunder Blade White Blue", "https://ecs7.tokopedia.net/img/cache/700/product-1/2019/2/7/1810099/1810099_120824d4-9367-4d48-97f5-7107243310dd_707_707.jpg"},
            {"Yonex Power Cushion 100 DR Blue/Navy", "https://images-na.ssl-images-amazon.com/images/I/71GZjMsXNwL._UX395_.jpg"},
            {"Victor P9200FL H", "http://id.victorsport.com/files/id/product/list_56834.jpg"},
    };

    public static ArrayList<DataSepatu> getListData(){
        ArrayList<DataSepatu> list = new ArrayList<>();
        for(String[] kData : data){
            DataSepatu datasepatu = new DataSepatu();
            datasepatu.setNama(kData[0]);
            datasepatu.setFoto(kData[1]);
            list.add(datasepatu);
        }

        return list;
    }
}
