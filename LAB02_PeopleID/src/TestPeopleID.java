public class TestPeopleID {
    public static void main(String[] args) {
        Date dobObj = new Date(23, 4, 2000);
        Name nameObj = new Name("Wiangping", "Sangjan");
        Address addressObj = new Address("81/9", "2", "ChiangMai-HangDong", "Sunpakwan", "Hang Dong", "Chiang Mai", "50230");

        String idObj = "3-5015-00274-987";

        peopleID peopleIDObj = new peopleID(nameObj, idObj, dobObj, addressObj);

        peopleIDObj.printPeopleID();

        System.out.println("--------------------------------------------");
        System.out.print("The name of peopleIDObj is "); peopleIDObj.name.printName();
///     nameObj.printName(); if the properties is changed then this can't be used, but it's okay with this exercise

        System.out.print("The post code of the peopleIDObj is ");
        System.out.println(peopleIDObj.address.postcode);
///     System.out.println(addressObj.postcode); if the properties is changed then this can't be used, but it's okay with this exercise
        System.out.println("--------------------------------------------");

    }
    
}
