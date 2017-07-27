package ua.com.nmobile.service.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.nmobile.entity.User;
import ua.com.nmobile.service.MailService;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

@Service
@Transactional
public class MailServiceImpl implements MailService {
    @Autowired
    JavaMailSender javaMailSender;

    public void send(User user) {

        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        try {
            message.setFrom(new InternetAddress("ihor.didyk.mtr.2016@lpnu.ua"));
            helper.setTo(user.getEmail());
            helper.setText("Hello" + user.getUsername() + "visit our the new <h1> NMobile <h1> adminPage", true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(message);
    }
}
