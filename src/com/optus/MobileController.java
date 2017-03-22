package com.optus;

import java.util.Set;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

public class MobileController extends AbstractController {
	
	
	private MobileService mobileService;

    public void setMobileService(MobileService mobileService) {
        this.mobileService = mobileService;
    }

    @Override
    public ModelAndView handleRenderRequestInternal(RenderRequest request, RenderResponse response){

        Set mobiles = mobileService.getAllMobiles();
        ModelAndView mv = new ModelAndView("viewMobiles", "mobile", mobiles);
        return mv;
    }

}
