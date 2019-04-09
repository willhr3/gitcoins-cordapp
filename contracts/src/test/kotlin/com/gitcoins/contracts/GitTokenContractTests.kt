package com.gitcoins.contracts

import net.corda.core.contracts.Contract
import org.junit.Test

class GitTokenContractTests {

    @Test
    fun `dummy test`() {
        assert((GitTokenContract() is Contract))
    }
}