public class ZAD7 {
    public static void main(String[] args) {
        Magazine_7 magazine7 = new Magazine_7(3);

        System.out.println(magazine7.isLoaded());
        magazine7.shoot();
        magazine7.loadBullet("A");
        magazine7.loadBullet("B");
        magazine7.loadBullet("C");
        magazine7.loadBullet("D");
        magazine7.shoot();
        magazine7.shoot();
        magazine7.shoot();
        magazine7.shoot();
    }
}
