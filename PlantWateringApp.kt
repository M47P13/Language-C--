class Plant(private val id: Int, var name: String, var type: String, var wateringFrequency: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Plant) return false
        return id == other.id && name == other.name && type == other.type
    }

    override fun hashCode(): Int {
        var result = id
        result = 31 * result + name.hashCode()
        result = 31 * result + type.hashCode()
        return result
    }

    override fun toString(): String {
        return "Plant ID: $id, Name: $name, Type: $type, Watering Frequency: $wateringFrequency days"
    }
}

class PlantWateringApp {
    private val plants: MutableList<Plant> = mutableListOf()

    fun addPlant(plant: Plant) {
        if (!plants.contains(plant)) {
            plants.add(plant)
            println("Added ${plant.name} to the plant list.")
        } else {
            println("${plant.name} already exists in the plant list.")
        }
    }

    fun removePlant(plant: Plant) {
        val removed = plants.remove(plant)
        if (removed) {
            println("Removed ${plant.name} from the plant list.")
        } else {
            println("${plant.name} is not found in the plant list.")
        }
    }

    fun viewPlants(): List<Plant> {
        return plants.toList()
    }

    fun generateWateringSchedule() {
        for (plant in plants) {
            val schedule = when (plant.type) {
                "Flower" -> "Water ${plant.name} every ${plant.wateringFrequency} days."
                "Foliage" -> "Mist ${plant.name} every ${plant.wateringFrequency} days."
                "Succulent" -> "Water ${plant.name} lightly every ${plant.wateringFrequency} days."
                else -> "No specific watering schedule for ${plant.name}."
            }
            println(schedule)
        }
    }
}

class PlantLog {
    private val plantMap: MutableMap<Int, Plant> = mutableMapOf()
    private var currentId = 1 // Unique identifier for plants

    fun addPlant(plant: Plant) {
        plantMap[currentId] = plant
        println("Added ${plant.name} to the log with ID: $currentId")
        currentId++
    }

    fun removePlantById(id: Int) {
        val removedPlant = plantMap.remove(id)
        removedPlant?.let {
            println("Removed ${it.name} with ID: $id from the log.")
        } ?: run {
            println("Plant with ID: $id not found in the log.")
        }
    }

    fun viewPlantById(id: Int): Plant? {
        return plantMap[id]
    }

    fun viewAllPlants(): List<Plant> {
        return plantMap.values.toList()
    }
}

fun main() {
    val app = PlantWateringApp()

    val plant1 = Plant(1, "Rose", "Flower", 3)
    val plant2 = Plant(2, "Fern", "Foliage", 5)
    val plant3 = Plant(3, "Cactus", "Succulent", 7)

    app.addPlant(plant1)
    app.addPlant(plant2)
    app.addPlant(plant3)

    val plantsList = app.viewPlants()
    for (plant in plantsList) {
        println("Plant: ${plant.name}, Type: ${plant.type}, Watering Frequency: ${plant.wateringFrequency} days")
    }

    app.generateWateringSchedule()

    val plantLog = PlantLog()

    plantLog.addPlant(plant1)
    plantLog.addPlant(plant2)
    plantLog.addPlant(plant3)

    val allPlants = plantLog.viewAllPlants()
    println("All Plants in the Log:")
    allPlants.forEach { println(it) }

    val specificPlant = plantLog.viewPlantById(2)
    specificPlant?.let { println("Specific Plant: $it") } ?: println("Plant not found.")

    plantLog.removePlantById(1)
    val remainingPlants = plantLog.viewAllPlants()
    println("Remaining Plants in the Log:")
    remainingPlants.forEach { println(it) }
}
