/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bh.gov.works.session.test2;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author JalalAM
 */

@Named
@ViewScoped
public class IndexBean implements Serializable {
    
    private int counter;
    
    @PostConstruct
    public void init() {
        this.counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
    
    public void incrementCounter() {
        ++this.counter;
    }
}
