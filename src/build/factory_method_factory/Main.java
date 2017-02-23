package build.factory_method_factory;

import build.pojo.Product;

/**
 * Created by ZyL on 2017/2/23.
 * 工厂方法模式， 工厂模式
 * Connection conn=DriverManager.getConnection("jdbc:microsoft:sqlserver://loc
 * alhost:1433; DatabaseName=DB;user=sa;password=");
 * Statement statement=conn.createStatement();
 * ResultSet rs=statement.executeQuery("select * from UserInfo");
 */
public class Main {

    public static void main(String[] args) {
        ProductFactory factory = new ProductAFactory();
        ProductFactory factory2 = new ProductBFactory();

        Product productA = factory.getInstance();
        System.out.println(productA.getClass());

        Product productB = factory2.getInstance();
        System.out.println(productB.getClass());
    }
}
