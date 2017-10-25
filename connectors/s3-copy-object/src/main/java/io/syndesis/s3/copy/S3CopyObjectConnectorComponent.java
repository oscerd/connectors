package io.syndesis.s3.copy;

import org.apache.camel.component.connector.DefaultConnectorComponent;

/**
 * Camel S3CopyObjectConnectorComponent connector
 */
public class S3CopyObjectConnectorComponent extends DefaultConnectorComponent {
    
    public S3CopyObjectConnectorComponent() {
        super("S3CopyObjectConnectorComponent", "io.syndesis.s3.copy.S3CopyObjectConnectorComponent");
    }

}
