package ug.co.absa.africa.transfer.cucumber;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import ug.co.absa.africa.transfer.IntegrationTest;

@CucumberContextConfiguration
@IntegrationTest
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
