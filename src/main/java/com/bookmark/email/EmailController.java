package com.bookmark.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/sendEmail")
    public String sendEmail(@RequestParam String to) {
        System.out.println(to);
        String subject = "Bookmark - Landing Page";
        String text = "Obrigado por visitar meu site e demonstrar interesse em testá-lo. Ele foi criado com o propósito" +
                " de estudar Angular e aprimorar minhas habilidades constantemente. Para entrar em contato diretamente" +
                " comigo, sinta-se à vontade para enviar uma mensagem para (77) 99160-7631. Obrigado novamente!";
        emailService.sendSimpleMessage(to, subject, text);
        return "Email enviado com sucesso!";
    }
}
