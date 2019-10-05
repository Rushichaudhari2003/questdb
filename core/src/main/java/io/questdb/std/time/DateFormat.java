/*******************************************************************************
 *    ___                  _   ____  ____
 *   / _ \ _   _  ___  ___| |_|  _ \| __ )
 *  | | | | | | |/ _ \/ __| __| | | |  _ \
 *  | |_| | |_| |  __/\__ \ |_| |_| | |_) |
 *   \__\_\\__,_|\___||___/\__|____/|____/
 *
 * Copyright (C) 2014-2019 Appsicle
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 ******************************************************************************/

package io.questdb.std.time;

import io.questdb.std.NumericException;
import io.questdb.std.str.CharSink;

/**
 * Instances of DateFormat do not have state. They are thread-safe. In that multuple threads can use
 * same DateFormat instance without disk of data corruption.
 */
public interface DateFormat {

    void format(long datetime, DateLocale locale, CharSequence timeZoneName, CharSink sink);

    long parse(CharSequence in, DateLocale locale) throws NumericException;

    long parse(CharSequence in, int lo, int hi, DateLocale locale) throws NumericException;
}
