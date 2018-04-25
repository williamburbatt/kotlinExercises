import org.junit.Test
import org.junit.Ignore
import org.junit.Rule
import org.junit.rules.ExpectedException
import kotlin.test.assertEquals


class HammingTest {

    @Rule
    @JvmField
    var expectedException: ExpectedException = ExpectedException.none()

    @Test
    fun noDistanceBetweenEmptyStrands() {
        assertEquals(0, compute("", ""))
    }

    
    @Test
    fun noDistanceBetweenShortIdenticalStrands() {
        assertEquals(0, compute("A", "A"))
    }

    
    @Test
    fun noDistanceBetweenLongIdenticalStrands() {
        assertEquals(0, compute("GGACTGA", "GGACTGA"))
    }

    
    @Test
    fun completeDistanceInSingleNucleotideStrand() {
        assertEquals(1, compute("A", "G"))
    }

    
    @Test
    fun completeDistanceInSmallStrand() {
        assertEquals(2, compute("AG", "CT"))
    }

    
    @Test
    fun smallDistanceInSmallStrand() {
        assertEquals(1, compute("AT", "CT"))
    }

    
    @Test
    fun smallDistanceInMediumStrand() {
        assertEquals(1, compute("GGACG", "GGTCG"))
    }

    
    @Test
    fun smallDistanceInLongStrand() {
        assertEquals(2, compute("ACCAGGG", "ACTATGG"))
    }

    
    @Test
    fun nonUniqueCharacterInFirstStrand() {
        assertEquals(1, compute("AAG", "AAA"))
    }

    
    @Test
    fun nonUniqueCharacterInSecondStrand() {
        assertEquals(1, compute("AAA", "AAG"))
    }

    
    @Test
    fun sameNucleotidesInDifferentPositions() {
        assertEquals(2, compute("TAG", "GAT"))
    }

    
    @Test
    fun largeDistanceInPermutedStrand() {
        assertEquals(4, compute("GATACA", "GCATAA"))
    }

    
    @Test
    fun largeDistanceInOffByOneStrand() {
        assertEquals(9, compute("GGACGGATTCTG", "AGGACGGATTCT"))
    }

    @Ignore
    @Test
    fun validatesFirstStrandNotLonger() {
        expectedException.expect(IllegalArgumentException::class.java)
        expectedException.expectMessage("left and right strands must be of equal length.")

        compute("AATG", "AAA")
    }

    @Ignore
    @Test
    fun validatesSecondStrandNotLonger() {
        expectedException.expect(IllegalArgumentException::class.java)
        expectedException.expectMessage("left and right strands must be of equal length.")

        compute("ATA", "AGTG")
    }

}
