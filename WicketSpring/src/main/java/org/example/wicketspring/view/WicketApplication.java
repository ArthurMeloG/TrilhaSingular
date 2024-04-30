package org.example.wicketspring.view;

import org.apache.wicket.Page;
import org.apache.wicket.markup.head.filter.JavaScriptFilteredIntoFooterHeaderResponse;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;

import org.springframework.stereotype.Component;

@Component
public class WicketApplication extends WebApplication {
    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }

    @Override
    protected void init() {
        super.init();
        setUpCsp();
        setUpString();
        setUpFooterContainer();
    }

    private void setUpFooterContainer() {
        getHeaderResponseDecorators().add(response -> new JavaScriptFilteredIntoFooterHeaderResponse(response, "footer-container"));
    }

    private void setUpString() {
        getComponentInstantiationListeners().add(new SpringComponentInjector(this));
    }

    private void setUpCsp() {
        getCspSettings().blocking().disabled();
    }
}
