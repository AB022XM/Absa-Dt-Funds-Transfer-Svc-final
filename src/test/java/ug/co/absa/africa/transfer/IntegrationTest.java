package ug.co.absa.africa.transfer;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import ug.co.absa.africa.transfer.AbsaDtfundsTransferSvcfinalApp;
import ug.co.absa.africa.transfer.config.AsyncSyncConfiguration;
import ug.co.absa.africa.transfer.config.EmbeddedElasticsearch;
import ug.co.absa.africa.transfer.config.EmbeddedRedis;
import ug.co.absa.africa.transfer.config.EmbeddedSQL;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { AbsaDtfundsTransferSvcfinalApp.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedElasticsearch
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
