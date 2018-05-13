package ru.stqa.pft.addressbook;


import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        initeGroupCreation();
        fillGroupForm(new GroupData("test1", "test1", "new test group"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
