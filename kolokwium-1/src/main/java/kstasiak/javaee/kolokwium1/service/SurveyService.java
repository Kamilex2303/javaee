package kstasiak.javaee.kolokwium1.service;

import java.util.ArrayList;
import java.util.List;

import kstasiak.javaee.kolokwium1.domain.Survey;

public class SurveyService {
    private List<Survey> db = new ArrayList<Survey>();

    public void addSurvey(Survey survey) {
        Survey newSurvey = new Survey(survey.getFrom(), survey.getTo(), survey.getFrequency(), survey.getDescription());
        db.add(newSurvey);
    }

    public List<Survey> getAllSurveys() {
        return db;
    }

    public void removeSurvey(Survey newsletter) {
        db.remove(newsletter);
    }
}
