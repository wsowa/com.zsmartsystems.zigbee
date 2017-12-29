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
 * Scan Command value object class.
 * <p>
 * The scan request command frame is used to initiate a scan for other devices in the vicinity
 * of the originator. The information contained in this command frame relates to the scan
 * request initiator.
 * <br>
 * This  inter-PAN command  shall  be  formatted  according  to  the  general  inter-PAN  frame
 * format  with  the following clarifications. In the MAC header, the ACK request and destination
 * addressing mode sub-fields of the frame control field shall be set to 0 (no ACK requested)
 * and 0b10 (short network address), respectively, the destination address field shall be set
 * to 0xffff (broadcast network address) and the source PAN ID field shall be set to any value
 * in the range 0x0001 –0xfffe, if the device is factory new, or the PAN identifier of the device,
 * otherwise. In the APS header, the delivery mode sub-field of the frame control field shall be
 * set to 0b10 (broadcast). In the ZCL header, the direction sub-field of the frame control field
 * shall be set to 0 (client to server) and the command identifier shall be set to 0x00 (scan request).
 * <p>
 * Cluster: <b>Touchlink</b>. Command is sent <b>TO</b> the server.
 * This command is a <b>specific</b> command used for the Touchlink cluster.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class ScanCommand extends ZclCommand {
    /**
     * InterPan transaction ID command message field.
     */
    private Integer interPanTransactionId;

    /**
     * ZigBee information command message field.
     */
    private Integer zigBeeInformation;

    /**
     * Touchlink Information command message field.
     */
    private Integer touchlinkInformation;

    /**
     * Default constructor.
     */
    public ScanCommand() {
        genericCommand = false;
        clusterId = 4096;
        commandId = 0;
        commandDirection = ZclCommandDirection.CLIENT_TO_SERVER;
    }

    /**
     * Gets InterPan transaction ID.
     *
     * @return the InterPan transaction ID
     */
    public Integer getInterPanTransactionId() {
        return interPanTransactionId;
    }

    /**
     * Sets InterPan transaction ID.
     *
     * @param interPanTransactionId the InterPan transaction ID
     */
    public void setInterPanTransactionId(final Integer interPanTransactionId) {
        this.interPanTransactionId = interPanTransactionId;
    }

    /**
     * Gets ZigBee information.
     *
     * @return the ZigBee information
     */
    public Integer getZigBeeInformation() {
        return zigBeeInformation;
    }

    /**
     * Sets ZigBee information.
     *
     * @param zigBeeInformation the ZigBee information
     */
    public void setZigBeeInformation(final Integer zigBeeInformation) {
        this.zigBeeInformation = zigBeeInformation;
    }

    /**
     * Gets Touchlink Information.
     *
     * @return the Touchlink Information
     */
    public Integer getTouchlinkInformation() {
        return touchlinkInformation;
    }

    /**
     * Sets Touchlink Information.
     *
     * @param touchlinkInformation the Touchlink Information
     */
    public void setTouchlinkInformation(final Integer touchlinkInformation) {
        this.touchlinkInformation = touchlinkInformation;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        serializer.serialize(interPanTransactionId, ZclDataType.UNSIGNED_32_BIT_INTEGER);
        serializer.serialize(zigBeeInformation, ZclDataType.BITMAP_8_BIT);
        serializer.serialize(touchlinkInformation, ZclDataType.BITMAP_8_BIT);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        interPanTransactionId = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_32_BIT_INTEGER);
        zigBeeInformation = (Integer) deserializer.deserialize(ZclDataType.BITMAP_8_BIT);
        touchlinkInformation = (Integer) deserializer.deserialize(ZclDataType.BITMAP_8_BIT);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder(132);
        builder.append("ScanCommand [");
        builder.append(super.toString());
        builder.append(", interPanTransactionId=");
        builder.append(interPanTransactionId);
        builder.append(", zigBeeInformation=");
        builder.append(zigBeeInformation);
        builder.append(", touchlinkInformation=");
        builder.append(touchlinkInformation);
        builder.append(']');
        return builder.toString();
    }

}
