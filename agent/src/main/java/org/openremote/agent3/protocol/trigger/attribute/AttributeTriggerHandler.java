/*
 * Copyright 2017, OpenRemote Inc.
 *
 * See the CONTRIBUTORS.txt file in the distribution for a
 * full listing of individual contributors.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.openremote.agent3.protocol.trigger.attribute;

import org.openremote.agent3.protocol.trigger.AbstractTriggerHandler;
import org.openremote.model.asset.AssetAttribute;
import org.openremote.model.attribute.AttributeEvent;
import org.openremote.model.attribute.AttributeRef;
import org.openremote.model.value.Value;

public class AttributeTriggerHandler extends AbstractTriggerHandler {

    public static final String ATTRIBUTE_TRIGGER_HANDLER_NAME = "Attribute Event Trigger Handler";

    @Override
    protected String getName() {
        return ATTRIBUTE_TRIGGER_HANDLER_NAME;
    }

    @Override
    protected boolean isValidValue(Value triggerValue) {
        return false;
    }

    @Override
    protected void registerTrigger(AttributeRef triggerRef, Value value, boolean isEnabled) {

    }

    @Override
    protected void unregisterTrigger(AttributeRef triggerRef) {

    }

    @Override
    protected void registerAttribute(AttributeRef attributeRef, AttributeRef triggerRef, String propertyName) {

    }


    @Override
    protected void unregisterAttribute(AttributeRef attributeRef, AttributeRef triggerRef) {

    }

    @Override
    protected void processAttributeWrite(AssetAttribute attribute, AssetAttribute protocolConfiguration, String propertyName, AttributeEvent event) {

    }
}
