/*
 * File   : $Source: /alkacon/cvs/opencms/test/org/opencms/file/AllTests.java,v $
 * Date   : $Date: 2004/08/17 16:09:25 $
 * Version: $Revision: 1.20 $
 *
 * This library is part of OpenCms -
 * the Open Source Content Mananagement System
 *
 * Copyright (C) 2002 - 2003 Alkacon Software (http://www.alkacon.com)
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * For further information about Alkacon Software, please see the
 * company website: http://www.alkacon.com
 *
 * For further information about OpenCms, please see the
 * project website: http://www.opencms.org
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package org.opencms.file;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test cases for the VFS operations.<p> 
 * 
 * @author Alexander Kandzior (a.kandzior@alkacon.com)
 * 
 * @version $Revision: 1.20 $
 * 
 * @since 5.0
 */
public final class AllTests {

    /**
     * Hide constructor to prevent generation of class instances.<p>
     */
    private AllTests() {
        // empty
    }

    /**
     * Returns the JUnit test suite for this package.<p>
     * 
     * @return the JUnit test suite for this package
     */
    public static Test suite() {
        TestSuite suite = new TestSuite("Tests for package org.opencms.file");
        //$JUnit-BEGIN$
        suite.addTest(TestChacc.suite());
        suite.addTest(TestCopy.suite());
        suite.addTest(TestCreateWriteResource.suite());
        suite.addTest(TestRestoreFromHistory.suite());
        suite.addTest(TestLock.suite());
        suite.addTest(TestTouch.suite());
        suite.addTest(TestSiblings.suite());
        suite.addTest(TestReadResource.suite());
        suite.addTest(TestMoveRename.suite());
        suite.addTest(TestUndoChanges.suite());
        suite.addTest(TestPermissions.suite());
        suite.addTest(TestProperty.suite());
        suite.addTest(TestResourceOperations.suite());
        suite.addTest(TestProjects.suite());
        suite.addTest(TestProperyDefinition.suite());
        suite.addTest(TestPublishing.suite());
        //$JUnit-END$
        return suite;
    }
}