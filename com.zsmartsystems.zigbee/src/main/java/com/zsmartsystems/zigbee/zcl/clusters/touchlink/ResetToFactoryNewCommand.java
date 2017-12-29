/**
 * Copyright (c) 2016-2017 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.touchlink;

import com.zsmartsystems.zigbee.zcl.ZclCommand;
import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zcl.protocol.ZclCommandDirection;

/**
 * Reset to Factory New Command value object class.
 * <p>
 * The reset to factory new request command frame is used to request that the recipient resets
 * itself back to its factory new state.
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ResetToFactoryNewCommand extends ZclCommand {
    /**
     * InterPan transaction ID command message field.
     *
     * The inter-PAN transaction identifier field is 32-bits in length
     * and specifies an identifier for the inter-PAN transaction. This
     * field shall contain a non-zero 32-bit random number and is used
     * to identify the current reset to factory new request.
     */
    private Integer interPanTransactionId;

    /**
     * Default constructor.
     */
    public ResetToFactoryNewCommand() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 7;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Gets InterPan transaction ID.
     *
     * The inter-PAN transaction identifier field is 32-bits in length
     * and specifies an identifier for the inter-PAN transaction. This
     * field shall contain a non-zero 32-bit random number and is used
     * to identify the current reset to factory new request.
     *
     * @return the InterPan transaction ID
     */
    public Integer getInterPanTransactionId() {
        return interPanTransactionId;
    }

    /**
     * Sets InterPan transaction ID.
     *
     * The inter-PAN transaction identifier field is 32-bits in length
     * and specifies an identifier for the inter-PAN transaction. This
     * field shall contain a non-zero 32-bit random number and is used
     * to identify the current reset to factory new request.
     *
     * @param interPanTransactionId the InterPan transaction ID
     */
    public void setInterPanTransactionId(final Integer interPanTransactionId) {
        this.interPanTransactionId = interPanTransactionId;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(interPanTransactionId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        interPanTransactionId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(68);
        builder.append("ResetToFactoryNewCommand [");
        builder.append(super.toString());
        builder.append(", interPanTransactionId=");
        builder.append(interPanTransactionId);
        builder.append(']');
        return builder.toString();
    }

}
