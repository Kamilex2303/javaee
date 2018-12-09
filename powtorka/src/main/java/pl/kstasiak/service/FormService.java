package pl.kstasiak.service;

import java.util.ArrayList;
import java.util.List;

import pl.kstasiak.domain.Form;

public class FormService {
    private List<Form> db = new ArrayList<Form>();

    public void addForm(Form form) {
        Form newForm = new Form(form.getName(), form.getFrom(), form.getTo(), form.getFrequency(), form.getComments());
        db.add(newForm);
    }

    public List<Form> getAllForms() {
        return db;
    }

    public void removeForm(Form form) {
        db.remove(form);
    }
}
