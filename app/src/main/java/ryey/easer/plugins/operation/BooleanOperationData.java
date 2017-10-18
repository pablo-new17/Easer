/*
 * Copyright (c) 2016 - 2017 Rui Zhao <renyuneyun@gmail.com>
 *
 * This file is part of Easer.
 *
 * Easer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Easer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Easer.  If not, see <http://www.gnu.org/licenses/>.
 */

package ryey.easer.plugins.operation;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

import java.io.IOException;

import ryey.easer.commons.IllegalXmlException;
import ryey.easer.commons.XmlHelper;
import ryey.easer.commons.plugindef.operationplugin.OperationData;
import ryey.easer.plugins.PluginRegistry;
import ryey.easer.plugins.reusable.BooleanData;

import static ryey.easer.plugins.PluginRegistry.getInstance;

public abstract class BooleanOperationData extends BooleanData implements OperationData {

    public BooleanOperationData() {super();}

    public BooleanOperationData(Boolean state) {
        super(state);
    }

    @Override
    public void parse(XmlPullParser parser, int version) throws IOException, XmlPullParserException, IllegalXmlException {
        set(XmlHelper.OperationHelper.handleBoolean(parser, getInstance().operation().findPlugin(this).name()));
    }

    @Override
    public void serialize(XmlSerializer serializer) throws IOException {
        XmlHelper.OperationHelper.dealBoolean(serializer, getInstance().operation().findPlugin(this).name(), (Boolean) get());
    }
}
