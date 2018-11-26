package katok;

import org.junit.*;
import org.junit.runners.MethodSorters;

import java.io.IOException;
import java.net.URISyntaxException;

public class TestMessages {
    private VkComMessagesAPI vk;
    private int recepientID = 43521608;
    int messageID = 210;

    @Before
    public void create() throws URISyntaxException {
        vk = new VkComMessagesAPI();
    }


    @Test
    @Ignore
    public void Test_1_SendingMessage() throws IOException, URISyntaxException {
        String messageText = "Some message text";
        vk.sendMessage(recepientID, messageText);
        Assert.assertEquals(messageText, vk.getMessageText(vk.getMessageID()));
    }

    @Test
    @Ignore
    public void Test_2_EditMessage() throws IOException, URISyntaxException {
        String editedMessage = "Message after edit";
        vk.editMessage(recepientID, messageID, editedMessage);
        Assert.assertEquals(editedMessage, vk.getMessageText(messageID));
    }

    @Test
    public void Test_3_DeleteMessage() throws IOException, URISyntaxException {
        Assert.assertTrue(vk.deleteMessage(messageID) > 0);
    }
}
