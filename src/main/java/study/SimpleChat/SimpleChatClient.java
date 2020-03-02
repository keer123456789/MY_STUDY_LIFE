package study.SimpleChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @BelongsProject: MY_STUDY_LIFE
 * @BelongsPackage: Head_First.JAVA
 * @Author: keer
 * @CreateTime: 2020-02-26 20:15
 * @Description:
 */
public class SimpleChatClient {
    JTextArea incoming;
    JTextField outgoing;
    BufferedReader reader;
    PrintWriter writer;
    Socket socket;

    public void go() {
        JFrame frame = new JFrame("聊天室");
        JPanel panel = new JPanel();
        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);
        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        outgoing = new JTextField(20);

        JButton sendButton = new JButton("send");
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sendButtonListener(actionEvent);
            }
        });
        panel.add(qScroller);
        panel.add(outgoing);
        panel.add(sendButton);
        setUpNetWorking();

        Thread readerThread = new Thread(new Runnable() {
            @Override
            public void run() {
                String message;
                try{
                    while((message=reader.readLine())!=null){
                        System.out.println("read "+message);
                        incoming.append(message+"\n");
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(400, 500);
        frame.setVisible(true);
    }

    private void setUpNetWorking() {
        try {
            socket = new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("networking established");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendButtonListener(ActionEvent e) {
        try {
            writer.println(outgoing.getText());
            writer.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        outgoing.setText("");
        outgoing.requestFocus();
    }

    public static void main(String[] args) {
        SimpleChatClient chatClient=new SimpleChatClient();
        chatClient.go();
    }
}
