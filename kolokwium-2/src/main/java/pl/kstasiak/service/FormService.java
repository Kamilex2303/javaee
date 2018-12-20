package pl.kstasiak.service;

import java.util.ArrayList;
import java.util.List;

import pl.kstasiak.domain.RustyNail;

public class FormService {
    private List<RustyNail> db = new ArrayList<RustyNail>();

    public void addForm(RustyNail form) {
        RustyNail newForm = new RustyNail(form.getProducer(), form.getDateOfProduction(), form.getHowLong(), form.getComments());
        db.add(newForm);
    }

    public List<RustyNail> getAllForms() {
        return db;
    }

    public void removeForm(RustyNail form) {
        db.remove(form);
    }
}
