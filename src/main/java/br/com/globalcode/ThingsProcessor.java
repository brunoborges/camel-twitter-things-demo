/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.globalcode;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import twitter4j.Status;

/**
 *
 * @author bruno
 */
class ThingsProcessor implements Processor {

    @Override
    public void process(Exchange exchng) throws Exception {
        Status tweet = exchng.getIn().getBody(Status.class);
        
        String text = tweet.getText();
        
        // process text from tweet
        
        
    }
}
