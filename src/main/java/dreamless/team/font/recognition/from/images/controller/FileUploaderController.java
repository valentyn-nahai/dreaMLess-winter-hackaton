package dreamless.team.font.recognition.from.images.controller;

import dreamless.team.font.recognition.from.images.entity.Data;
import dreamless.team.font.recognition.from.images.entity.PredictionResponse;
import dreamless.team.font.recognition.from.images.entity.Probability;
import dreamless.team.font.recognition.from.images.entity.Status;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.Random;


@RestController
public class FileUploaderController {

    @RequestMapping(value = "/prediction", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public PredictionResponse calculateFontPredictionFromImage(@RequestParam(value = "fileName", required = false) MultipartFile file) {
        return new PredictionResponse()
                .withData(new Data(Arrays.asList(
                        new Probability()
                                .withFont(getRandomFont())
                                .withProbability(((Math.random() * (1.0 - 0.8)) + 0.8))
                )))
                .withMessage("Test message")
                .withStatus(Status.OK);
    }

    public String getRandomFont() {
        String [] fonts = {
                "Amatic",
                "Arial",
                "Calibri",
                "Cambria",
                "Cambriab",
                "Caveat",
                "Comfortaa",
                "ComicSansMS",
                "Consolas",
                "CourierNew",
                "DroidSans",
                "DroidSerif",
                "FreeSans",
                "Lora",
                "Merriweather",
                "MonotypeCorsiva",
                "Montserrat",
                "Nunito",
                "Roboto",
                "TimesNewRoman",
                "Ubuntu",
                "UbuntuMono",
                "Unicode"
        };
        int randomIndexNumber = new Random().nextInt(fonts.length);
        return fonts[randomIndexNumber];
    }
}
