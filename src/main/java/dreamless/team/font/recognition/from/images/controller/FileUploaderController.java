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
    public PredictionResponse calculateFontPredictionFromImage(@RequestParam("file") MultipartFile file) {
        return new PredictionResponse()
                .withData(new Data(Arrays.asList(
                        new Probability()
                                .withFont("Arial")
                                .withProbability(new Random(System.nanoTime()).nextDouble())
                )))
                .withMessage("Test message")
                .withStatus(Status.OK);
    }
}
