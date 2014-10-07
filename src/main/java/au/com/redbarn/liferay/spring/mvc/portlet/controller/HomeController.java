/*
 * This file is part of liferay-spring-mvc-portlet.
 *
 * liferay-spring-mvc-portlet is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * liferay-spring-mvc-portlet is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * liferay-spring-mvc-portlet. If not, see <http://www.gnu.org/licenses/>.
 */
package au.com.redbarn.liferay.spring.mvc.portlet.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

import au.com.redbarn.liferay.spring.mvc.portlet.service.HomeService;

/**
 * Handles requests for the view mode.
 */
@Controller
@RequestMapping("VIEW")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Our home service.
	 */
	@Autowired
	HomeService homeService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RenderMapping
	public String home(Locale locale, Model model) {

		logger.info("Welcome home! the client locale is "+ locale.toString());

		model.addAttribute("message", homeService.getMessage());
		model.addAttribute("bandwidthHog", homeService.getBandwithHog());
		model.addAttribute("serverTime", homeService.getFormattedDate(locale));
		model.addAttribute("uptime", homeService.getUptime());
		model.addAttribute("defaultCompanyId", homeService.getDefaultCompanyId());

		return "home";
	}
}
