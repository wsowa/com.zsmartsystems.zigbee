package com.zsmartsystems.zigbee.zdo.command;

import com.zsmartsystems.zigbee.zcl.ZclFieldSerializer;
import com.zsmartsystems.zigbee.zcl.ZclFieldDeserializer;
import com.zsmartsystems.zigbee.zcl.protocol.ZclDataType;
import com.zsmartsystems.zigbee.zdo.ZdoResponse;
import com.zsmartsystems.zigbee.zdo.descriptors.NodeDescriptor;

/**
 * Node Descriptor Response value object class.
 * <p>
 * The Node_Desc_rsp is generated by a remote device in response to a
 * Node_Desc_req directed to the remote device. This command shall be unicast to
 * the originator of the Node_Desc_req command.
 * <br>
 * The NWKAddrOfInterest field shall match that specified in the original
 * Node_Desc_req command. If the NWKAddrOfInterest field matches the network
 * address of the remote device, it shall set the Status field to
 * SUCCESS and include its node descriptor in the NodeDescriptor field.
 * <br>
 * If the NWKAddrOfInterest field does not match the network address of the
 * remote device and it is an end device, it shall set the Status field to
 * INV_REQUESTTYPE and not include the NodeDescriptor field. If the
 * NWKAddrOfInterest field does not match the network address of the remote
 * device and it is the coordinator or a router, it shall determine whether the
 * NWKAddrOfInterest field matches the network address of one of its children. If
 * the NWKAddrOfInterest field does not match the network address of one of the
 * children of the remote device, it shall set the Status field to
 * DEVICE_NOT_FOUND and not include the NodeDescriptor field. If the
 * NWKAddrOfInterest matches the network address of one of the children of the
 * remote device, it shall determine whether a node descriptor for that device is
 * available. If a node descriptor is not available for the child indicated by the
 * NWKAddrOfInterest field, the remote device shall set the Status field to
 * NO_DESCRIPTOR and not include the NodeDescriptor field. If a node descriptor
 * is available for the child indicated by the NWKAddrOfInterest field, the remote
 * device shall set the Status field to SUCCESS and include the node descriptor of
 * the matching child device in the NodeDescriptor field.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
public class NodeDescriptorResponse extends ZdoResponse {
    /**
     * NWKAddrOfInterest command message field.
     */
    private Integer nwkAddrOfInterest;

    /**
     * NodeDescriptor command message field.
     */
    private NodeDescriptor nodeDescriptor;

    /**
     * Default constructor.
     */
    public NodeDescriptorResponse() {
        clusterId = 0x8002;
    }

    /**
     * Gets NWKAddrOfInterest.
     *
     * @return the NWKAddrOfInterest
     */
    public Integer getNwkAddrOfInterest() {
        return nwkAddrOfInterest;
    }

    /**
     * Sets NWKAddrOfInterest.
     *
     * @param nwkAddrOfInterest the NWKAddrOfInterest
     */
    public void setNwkAddrOfInterest(final Integer nwkAddrOfInterest) {
        this.nwkAddrOfInterest = nwkAddrOfInterest;
    }

    /**
     * Gets NodeDescriptor.
     *
     * @return the NodeDescriptor
     */
    public NodeDescriptor getNodeDescriptor() {
        return nodeDescriptor;
    }

    /**
     * Sets NodeDescriptor.
     *
     * @param nodeDescriptor the NodeDescriptor
     */
    public void setNodeDescriptor(final NodeDescriptor nodeDescriptor) {
        this.nodeDescriptor = nodeDescriptor;
    }

    @Override
    public void serialize(final ZclFieldSerializer serializer) {
        super.serialize(serializer);

        serializer.serialize(status, ZclDataType.UNSIGNED_8_BIT_INTEGER);
        serializer.serialize(nwkAddrOfInterest, ZclDataType.NWK_ADDRESS);
        serializer.serialize(nodeDescriptor, ZclDataType.NODE_DESCRIPTOR);
    }

    @Override
    public void deserialize(final ZclFieldDeserializer deserializer) {
        super.deserialize(deserializer);

        status = (Integer) deserializer.deserialize(ZclDataType.UNSIGNED_8_BIT_INTEGER);
        if (status != 0) {
            // Don't read the full response if we have an error
            return;
        }
        nwkAddrOfInterest = (Integer) deserializer.deserialize(ZclDataType.NWK_ADDRESS);
        nodeDescriptor = (NodeDescriptor) deserializer.deserialize(ZclDataType.NODE_DESCRIPTOR);
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("NodeDescriptorResponse ");
        builder.append(super.toString());
        builder.append(", status=");
        builder.append(status);
        builder.append(", nwkAddrOfInterest=");
        builder.append(nwkAddrOfInterest);
        builder.append(", nodeDescriptor=");
        builder.append(nodeDescriptor);
        return builder.toString();
    }

}